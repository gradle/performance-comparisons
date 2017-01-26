package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_84 {
    private final Production74_84 production = new Production74_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}