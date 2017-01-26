package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_300 {
    private final Production89_300 production = new Production89_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}