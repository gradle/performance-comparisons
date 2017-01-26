package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42865 {
    private final Productionnull_42865 production = new Productionnull_42865("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}