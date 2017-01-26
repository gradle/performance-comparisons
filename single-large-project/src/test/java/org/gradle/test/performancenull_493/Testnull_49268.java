package org.gradle.test.performancenull_493;

import static org.junit.Assert.*;

public class Testnull_49268 {
    private final Productionnull_49268 production = new Productionnull_49268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}