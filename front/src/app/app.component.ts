import { Component, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { MenuItem } from 'primeng/api';
import { DockModule } from 'primeng/dock';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { ButtonModule } from 'primeng/button';
import { ProjectService } from './services/project.service';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, DockModule, CommonModule, FormsModule, ButtonModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent implements OnInit {
  title = 'front';

  items: MenuItem[] | undefined;
  public position: string = 'bottom';

  constructor(private projectService: ProjectService) {
  }

  ngOnInit() {
    this.items = [
      {
        label: 'Finder',
        icon: 'https://primefaces.org/cdn/primeng/images/dock/finder.svg'
      },
      {
        label: 'App Store',
        icon: 'https://primefaces.org/cdn/primeng/images/dock/appstore.svg'
      },
      {
        label: 'Photos',
        icon: 'https://primefaces.org/cdn/primeng/images/dock/photos.svg'
      },
      {
        label: 'Trash',
        icon: 'https://primefaces.org/cdn/primeng/images/dock/trash.png'
      }
    ];
  }

  loading: boolean = false;

  async load() {
    this.loading = true;

    const result = await this.projectService.get();
    this.loading = false
  }
}
