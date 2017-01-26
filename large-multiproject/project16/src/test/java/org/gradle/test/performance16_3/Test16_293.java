package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_293 {
    private final Production16_293 production = new Production16_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}