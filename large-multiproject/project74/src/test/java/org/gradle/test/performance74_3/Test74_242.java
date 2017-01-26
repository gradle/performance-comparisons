package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_242 {
    private final Production74_242 production = new Production74_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}