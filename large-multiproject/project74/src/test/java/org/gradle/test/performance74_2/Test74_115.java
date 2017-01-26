package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_115 {
    private final Production74_115 production = new Production74_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}