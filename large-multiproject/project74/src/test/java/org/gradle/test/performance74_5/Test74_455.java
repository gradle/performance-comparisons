package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_455 {
    private final Production74_455 production = new Production74_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}