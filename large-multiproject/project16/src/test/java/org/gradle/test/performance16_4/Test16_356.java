package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_356 {
    private final Production16_356 production = new Production16_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}