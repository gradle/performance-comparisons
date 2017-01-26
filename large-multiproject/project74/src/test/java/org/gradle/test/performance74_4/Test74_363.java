package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_363 {
    private final Production74_363 production = new Production74_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}