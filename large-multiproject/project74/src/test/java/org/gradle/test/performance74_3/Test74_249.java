package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_249 {
    private final Production74_249 production = new Production74_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}