package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_301 {
    private final Production74_301 production = new Production74_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}