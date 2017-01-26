package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_181 {
    private final Production5_181 production = new Production5_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}