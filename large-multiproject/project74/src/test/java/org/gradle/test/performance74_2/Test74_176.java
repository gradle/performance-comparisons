package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_176 {
    private final Production74_176 production = new Production74_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}