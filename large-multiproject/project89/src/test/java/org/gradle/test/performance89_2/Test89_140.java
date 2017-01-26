package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_140 {
    private final Production89_140 production = new Production89_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}