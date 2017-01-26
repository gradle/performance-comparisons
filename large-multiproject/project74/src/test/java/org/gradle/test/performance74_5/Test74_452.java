package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_452 {
    private final Production74_452 production = new Production74_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}