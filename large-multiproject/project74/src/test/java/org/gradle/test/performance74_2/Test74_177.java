package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_177 {
    private final Production74_177 production = new Production74_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}