package org.gradle.test.performancenull_493;

import static org.junit.Assert.*;

public class Testnull_49281 {
    private final Productionnull_49281 production = new Productionnull_49281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}