package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_313 {
    private final Production74_313 production = new Production74_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}