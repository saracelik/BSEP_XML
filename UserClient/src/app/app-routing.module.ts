import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { HomePageComponent } from './home-page/home-page.component';
import { ClientProfileComponent } from './client-profile/client-profile.component';
import { AccommodationDetailsComponent } from './accommodation-details/accommodation-details.component';

const routes: Routes = [
    {
    path: '',
    component: HomePageComponent
    },
    {
      path: 'homePage',
      component: HomePageComponent
    },
	{
      path: 'login',
      component: LoginComponent
    },
    {
      path: 'register',
      component: RegisterComponent
    },
    {
        path: 'clientProfile',
        component: ClientProfileComponent
      },
      {
          path: 'details',
          component: AccommodationDetailsComponent
      }

	
	];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
