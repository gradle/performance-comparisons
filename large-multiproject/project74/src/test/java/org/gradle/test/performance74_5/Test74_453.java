package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_453 {
    private final Production74_453 production = new Production74_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}