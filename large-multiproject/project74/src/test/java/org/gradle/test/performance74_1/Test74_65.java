package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_65 {
    private final Production74_65 production = new Production74_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}