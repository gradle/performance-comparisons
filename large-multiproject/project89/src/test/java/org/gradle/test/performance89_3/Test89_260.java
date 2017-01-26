package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_260 {
    private final Production89_260 production = new Production89_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}