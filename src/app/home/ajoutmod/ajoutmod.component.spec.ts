import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AjoutmodComponent } from './ajoutmod.component';

describe('AjoutmodComponent', () => {
  let component: AjoutmodComponent;
  let fixture: ComponentFixture<AjoutmodComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AjoutmodComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AjoutmodComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
