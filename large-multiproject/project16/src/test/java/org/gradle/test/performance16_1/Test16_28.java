package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_28 {
    private final Production16_28 production = new Production16_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}