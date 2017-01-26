package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_158 {
    private final Production74_158 production = new Production74_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}