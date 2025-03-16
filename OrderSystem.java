// Base Class: Order
class Order {
    int orderId;
    String orderDate;

    // Constructor
    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order Placed (Order ID: " + orderId + ")";
    }
}

// Subclass: ShippedOrder
class ShippedOrder extends Order {
    String trackingNumber;

    // Constructor
    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }


    String getOrderStatus() {
        return "Order Shipped (Order ID: " + orderId + ", Tracking No: " + trackingNumber + ")";
    }
}

// Subclass: DeliveredOrder (Extends ShippedOrder)
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    // Constructor
    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }


    String getOrderStatus() {
        return "Order Delivered (Order ID: " + orderId + ", Delivered on: " + deliveryDate + ")";
    }
}


public class OrderSystem {
    public static void main(String[] args) {
        Order order = new Order(101, "2025-03-11");
        ShippedOrder shippedOrder = new ShippedOrder(102, "2025-03-10", "TRK12345");
        DeliveredOrder deliveredOrder = new DeliveredOrder(103, "2025-03-09", "TRK67890", "2025-03-11");


        Order[] orders = { order, shippedOrder, deliveredOrder };

        for (Order o : orders) {
            System.out.println(o.getOrderStatus());
        }
    }
}
