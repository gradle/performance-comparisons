package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_306 {
    private final Production74_306 production = new Production74_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}