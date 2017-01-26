package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_373 {
    private final Production5_373 production = new Production5_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}