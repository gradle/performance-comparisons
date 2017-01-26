package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_373 {
    private final Production16_373 production = new Production16_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}