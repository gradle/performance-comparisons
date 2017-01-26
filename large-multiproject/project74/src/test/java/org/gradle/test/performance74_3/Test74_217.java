package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_217 {
    private final Production74_217 production = new Production74_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}