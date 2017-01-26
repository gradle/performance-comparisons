package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_229 {
    private final Production89_229 production = new Production89_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}