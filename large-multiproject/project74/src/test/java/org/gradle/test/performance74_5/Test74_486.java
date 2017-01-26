package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_486 {
    private final Production74_486 production = new Production74_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}