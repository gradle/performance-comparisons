package org.gradle.test.performancenull_341;

import static org.junit.Assert.*;

public class Testnull_34061 {
    private final Productionnull_34061 production = new Productionnull_34061("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}