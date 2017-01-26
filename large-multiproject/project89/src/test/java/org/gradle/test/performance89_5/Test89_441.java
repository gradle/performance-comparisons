package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_441 {
    private final Production89_441 production = new Production89_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}