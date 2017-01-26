package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_74 {
    private final Production89_74 production = new Production89_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}