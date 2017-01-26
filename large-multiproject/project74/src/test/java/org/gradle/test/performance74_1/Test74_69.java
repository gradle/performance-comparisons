package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_69 {
    private final Production74_69 production = new Production74_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}