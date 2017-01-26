package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_440 {
    private final Production5_440 production = new Production5_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}