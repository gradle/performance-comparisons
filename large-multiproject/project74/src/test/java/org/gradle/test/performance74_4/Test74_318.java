package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_318 {
    private final Production74_318 production = new Production74_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}