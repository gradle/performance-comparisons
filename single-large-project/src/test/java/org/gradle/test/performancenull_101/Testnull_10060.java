package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10060 {
    private final Productionnull_10060 production = new Productionnull_10060("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}