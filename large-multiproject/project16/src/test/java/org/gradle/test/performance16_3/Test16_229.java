package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_229 {
    private final Production16_229 production = new Production16_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}