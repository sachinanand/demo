var Billing = React.createClass({

    render: function () {
        return (
            <li>
                <a href="#">
                    <i className="glyphicon glyphicon-usd"></i>
                    <span>BILLING</span>
                </a>
            </li>
        )
    }
});
var Help = React.createClass({

    render: function () {
        return (
            <li>
                <a href="#">
                    <i className="glyphicon glyphicon-question-sign"></i>
                    <span>HELP</span>
                </a>
            </li>
        )
    }
});
var Home = React.createClass({

    render: function () {
        return (
            <li >
                <a href="#">
                    <i className="glyphicon glyphicon-home"></i>
                    <span>HOME</span>
                </a>

            </li>
        )
    }
});

var Inventory = React.createClass({

    render: function () {
        return (
            <li>
                <a href="#">
                    <i className="glyphicon glyphicon-th-list"></i>
                    <span>INVENTORY</span>
                </a>

            </li>
        )
    }
});

var Orders = React.createClass({

    render: function () {
        return (
            <li>
                <a href="#">
                    <i className="glyphicon glyphicon-shopping-cart"></i>
                    <span>ORDERS</span>
                </a>
            </li>
        )
    }
});

var Quotes = React.createClass({

    render: function () {
        return (
            <li>
                <a href="#">
                    <i className="glyphicon glyphicon-plus-sign"></i>
                    <span>QUOTES</span>
                </a>
            </li>
        )
    }
});

var ServiceLookup = React.createClass({

    render: function () {
        return (
            <li>
                <a href="#">
                    <i className="glyphicon glyphicon-map-marker"></i>
                    <span>SERVICE LOOKUP</span>
                </a>
            </li>
        )
    }
});
var Settings = React.createClass({

    render: function () {
        return (
            <li>
                <a href="#">
                    <i className="glyphicon glyphicon-cog"></i>
                    <span>SETTINGS</span>
                </a>
            </li>
        )
    }
});

var TroubleTicket = React.createClass({

    render: function () {
        return (
            <li>
                <a href="#">
                    <i className="glyphicon glyphicon-warning-sign"></i>
                    <span>TROUBLE TICKET</span>
                </a>
            </li>
        )
    }
});

var LayoutHeader = React.createClass({

    render: function () {
        return (
            <div>
                <header className="main-header">

                    <a href="#" className="">


                        <span className="logo-lg">
                            <b></b>
                        </span>
                    </a>

                    <nav className="navbar navbar-static-top" role="navigation">


                        <div className="navbar-custom-menu">

                        </div>
                    </nav>
                </header>

            </div>

        )
    }
});


var SideLayout = React.createClass({

    render: function () {
        return (
            <aside className="main-sidebar">
                <section className="sidebar">
                    <ul className="sidebar-menu">
                        <Home/>
                        <Inventory/>
                        <TroubleTicket/>
                        <ServiceLookup/>
                        <Orders/>
                        <Billing/>
                        <Settings/>
                        <Help/>
                    </ul>
                </section>
            </aside>
        )
    }
});
var MainLayout = React.createClass({

    render: function () {
        return (
            <div>
                <SideLayout/>
                <LayoutHeader/>
            </div>
        )
    }
});

ReactDOM.render(<MainLayout/>, document.getElementById('twc-layout'));

