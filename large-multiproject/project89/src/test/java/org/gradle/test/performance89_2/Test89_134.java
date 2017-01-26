package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_134 {
    private final Production89_134 production = new Production89_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}