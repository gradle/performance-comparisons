package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_405 {
    private final Production89_405 production = new Production89_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}