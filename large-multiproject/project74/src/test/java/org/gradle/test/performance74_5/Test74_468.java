package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_468 {
    private final Production74_468 production = new Production74_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}