package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_109 {
    private final Production89_109 production = new Production89_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}