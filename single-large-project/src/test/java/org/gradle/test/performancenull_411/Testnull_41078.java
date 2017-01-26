package org.gradle.test.performancenull_411;

import static org.junit.Assert.*;

public class Testnull_41078 {
    private final Productionnull_41078 production = new Productionnull_41078("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}