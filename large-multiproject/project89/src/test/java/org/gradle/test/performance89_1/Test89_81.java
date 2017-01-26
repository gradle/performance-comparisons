package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_81 {
    private final Production89_81 production = new Production89_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}