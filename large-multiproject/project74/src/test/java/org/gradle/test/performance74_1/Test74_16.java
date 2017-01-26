package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_16 {
    private final Production74_16 production = new Production74_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}