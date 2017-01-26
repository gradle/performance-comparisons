package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_110 {
    private final Production74_110 production = new Production74_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}