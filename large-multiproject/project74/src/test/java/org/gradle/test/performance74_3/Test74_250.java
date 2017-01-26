package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_250 {
    private final Production74_250 production = new Production74_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}