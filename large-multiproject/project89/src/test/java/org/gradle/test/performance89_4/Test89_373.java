package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_373 {
    private final Production89_373 production = new Production89_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}