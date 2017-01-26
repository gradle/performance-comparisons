package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_422 {
    private final Production16_422 production = new Production16_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}