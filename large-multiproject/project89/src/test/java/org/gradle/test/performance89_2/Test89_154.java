package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_154 {
    private final Production89_154 production = new Production89_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}