package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_124 {
    private final Production74_124 production = new Production74_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}