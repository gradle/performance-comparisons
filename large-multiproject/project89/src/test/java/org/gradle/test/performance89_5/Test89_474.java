package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_474 {
    private final Production89_474 production = new Production89_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}