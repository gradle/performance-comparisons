package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_405 {
    private final Production74_405 production = new Production74_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}