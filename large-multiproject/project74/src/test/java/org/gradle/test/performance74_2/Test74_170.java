package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_170 {
    private final Production74_170 production = new Production74_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}