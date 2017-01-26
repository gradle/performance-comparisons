package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34912 {
    private final Productionnull_34912 production = new Productionnull_34912("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}