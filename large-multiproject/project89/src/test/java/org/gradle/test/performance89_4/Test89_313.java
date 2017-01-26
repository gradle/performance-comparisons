package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_313 {
    private final Production89_313 production = new Production89_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}