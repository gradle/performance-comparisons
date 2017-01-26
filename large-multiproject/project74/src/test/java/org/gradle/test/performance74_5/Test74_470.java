package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_470 {
    private final Production74_470 production = new Production74_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}