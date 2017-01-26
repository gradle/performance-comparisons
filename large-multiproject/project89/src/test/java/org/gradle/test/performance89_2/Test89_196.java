package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_196 {
    private final Production89_196 production = new Production89_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}