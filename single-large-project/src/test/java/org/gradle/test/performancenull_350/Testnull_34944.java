package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34944 {
    private final Productionnull_34944 production = new Productionnull_34944("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}