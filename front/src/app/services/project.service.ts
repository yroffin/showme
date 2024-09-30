import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Project } from '../models/project';

@Injectable({
  providedIn: 'root'
})
export class ProjectService {

  constructor(private http: HttpClient) {
  }

  async get(): Promise<Project[]> {
    let promise = new Promise<Project[]>((resolve, reject) => {
      this.http.get<Project[]>('/api/project').subscribe(projects => {
        resolve([]);
      });
    })
    return promise;
  }
}
