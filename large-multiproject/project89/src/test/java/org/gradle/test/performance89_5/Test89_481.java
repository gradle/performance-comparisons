package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_481 {
    private final Production89_481 production = new Production89_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}