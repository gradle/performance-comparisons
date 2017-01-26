package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_499 {
    private final Production74_499 production = new Production74_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}