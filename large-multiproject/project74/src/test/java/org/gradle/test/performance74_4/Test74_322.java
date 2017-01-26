package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_322 {
    private final Production74_322 production = new Production74_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}