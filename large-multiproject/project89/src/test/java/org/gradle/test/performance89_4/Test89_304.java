package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_304 {
    private final Production89_304 production = new Production89_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}