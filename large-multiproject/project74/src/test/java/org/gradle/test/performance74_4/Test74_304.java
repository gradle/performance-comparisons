package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_304 {
    private final Production74_304 production = new Production74_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}