package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_489 {
    private final Production74_489 production = new Production74_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}