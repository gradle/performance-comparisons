package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_34 {
    private final Production89_34 production = new Production89_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}