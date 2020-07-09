package xfleet.utilities;

import xfleet.pages.activities.CalendarEventsPage;
import xfleet.pages.dashboards.DashboardPage;
import xfleet.pages.dashboards.ManageDashboards;
import xfleet.pages.fleet.VehiclesPage;
import xfleet.pages.login_navigation.LoginPage;

public class Pages {
    private LoginPage loginPage;
    private CalendarEventsPage calendarEventsPage;
    private DashboardPage dashboardPage;
    private ManageDashboards manageDashboards;
    private VehiclesPage vehiclesPage;


    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public CalendarEventsPage calendarEventsPage() {
        if (calendarEventsPage == null) {
            calendarEventsPage = new CalendarEventsPage();
        }
        return calendarEventsPage;
    }

    public DashboardPage dashboardPage() {
        if (dashboardPage == null) {
            dashboardPage = new DashboardPage();
        }
        return dashboardPage;
    }

    public ManageDashboards manageDashboards() {
        if (manageDashboards == null) {
            manageDashboards = new ManageDashboards();
        }
        return manageDashboards;
    }

    public VehiclesPage vehiclesPage() {
        if (vehiclesPage == null) {
            vehiclesPage = new VehiclesPage();
        }
        return vehiclesPage;
    }

}
