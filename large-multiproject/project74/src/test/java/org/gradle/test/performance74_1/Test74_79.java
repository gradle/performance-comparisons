package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_79 {
    private final Production74_79 production = new Production74_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}