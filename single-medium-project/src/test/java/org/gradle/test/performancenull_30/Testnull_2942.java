package org.gradle.test.performancenull_30;

import static org.junit.Assert.*;

public class Testnull_2942 {
    private final Productionnull_2942 production = new Productionnull_2942("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}