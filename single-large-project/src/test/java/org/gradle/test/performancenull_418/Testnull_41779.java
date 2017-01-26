package org.gradle.test.performancenull_418;

import static org.junit.Assert.*;

public class Testnull_41779 {
    private final Productionnull_41779 production = new Productionnull_41779("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}