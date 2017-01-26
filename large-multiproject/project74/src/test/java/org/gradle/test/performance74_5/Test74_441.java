package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_441 {
    private final Production74_441 production = new Production74_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}