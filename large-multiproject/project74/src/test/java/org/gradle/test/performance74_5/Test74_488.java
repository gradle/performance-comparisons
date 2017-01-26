package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_488 {
    private final Production74_488 production = new Production74_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}