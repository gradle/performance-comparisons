package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_399 {
    private final Production74_399 production = new Production74_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}