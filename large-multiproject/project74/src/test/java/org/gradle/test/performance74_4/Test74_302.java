package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_302 {
    private final Production74_302 production = new Production74_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}