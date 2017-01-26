package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_450 {
    private final Production89_450 production = new Production89_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}