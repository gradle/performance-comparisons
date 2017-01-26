package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_313 {
    private final Production4_313 production = new Production4_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}