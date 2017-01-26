package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_473 {
    private final Production74_473 production = new Production74_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}