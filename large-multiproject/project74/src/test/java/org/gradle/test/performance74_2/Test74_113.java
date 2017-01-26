package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_113 {
    private final Production74_113 production = new Production74_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}