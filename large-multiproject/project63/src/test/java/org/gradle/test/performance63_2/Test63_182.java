package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_182 {
    private final Production63_182 production = new Production63_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}