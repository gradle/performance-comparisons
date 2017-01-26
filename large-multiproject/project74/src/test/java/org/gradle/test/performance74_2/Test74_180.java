package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_180 {
    private final Production74_180 production = new Production74_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}