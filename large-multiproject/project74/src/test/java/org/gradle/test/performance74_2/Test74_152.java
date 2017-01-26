package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_152 {
    private final Production74_152 production = new Production74_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}