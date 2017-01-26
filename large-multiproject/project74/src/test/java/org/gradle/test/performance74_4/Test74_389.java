package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_389 {
    private final Production74_389 production = new Production74_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}