package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_182 {
    private final Production92_182 production = new Production92_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}