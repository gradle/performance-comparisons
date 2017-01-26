package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_56 {
    private final Production74_56 production = new Production74_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}