package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_479 {
    private final Production74_479 production = new Production74_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}