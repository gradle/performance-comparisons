package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_418 {
    private final Production89_418 production = new Production89_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}