package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_466 {
    private final Production89_466 production = new Production89_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}