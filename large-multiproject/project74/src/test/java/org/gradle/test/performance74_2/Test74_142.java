package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_142 {
    private final Production74_142 production = new Production74_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}