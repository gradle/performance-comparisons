package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_182 {
    private final Production26_182 production = new Production26_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}