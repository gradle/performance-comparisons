package org.gradle.test.performancenull_347;

import static org.junit.Assert.*;

public class Testnull_34698 {
    private final Productionnull_34698 production = new Productionnull_34698("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}