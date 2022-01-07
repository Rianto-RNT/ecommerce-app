import { TestBed } from '@angular/core/testing';

import { ShopRntFormService } from './shop-rnt-form.service';

describe('ShopRntFormService', () => {
  let service: ShopRntFormService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ShopRntFormService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
