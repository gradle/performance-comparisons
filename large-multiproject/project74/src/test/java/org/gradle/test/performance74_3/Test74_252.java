package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_252 {
    private final Production74_252 production = new Production74_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}