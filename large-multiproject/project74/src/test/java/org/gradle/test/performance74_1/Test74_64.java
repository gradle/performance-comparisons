package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_64 {
    private final Production74_64 production = new Production74_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}