package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_182 {
    private final Production99_182 production = new Production99_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}