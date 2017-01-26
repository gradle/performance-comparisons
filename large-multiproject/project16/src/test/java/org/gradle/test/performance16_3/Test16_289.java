package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_289 {
    private final Production16_289 production = new Production16_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}