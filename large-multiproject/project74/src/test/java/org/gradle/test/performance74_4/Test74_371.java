package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_371 {
    private final Production74_371 production = new Production74_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}