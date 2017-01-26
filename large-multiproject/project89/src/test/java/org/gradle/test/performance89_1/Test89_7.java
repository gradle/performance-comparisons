package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_7 {
    private final Production89_7 production = new Production89_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}