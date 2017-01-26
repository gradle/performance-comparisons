package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_244 {
    private final Production74_244 production = new Production74_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}