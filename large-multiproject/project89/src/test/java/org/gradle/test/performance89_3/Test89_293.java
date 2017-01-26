package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_293 {
    private final Production89_293 production = new Production89_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}