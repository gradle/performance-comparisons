package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_78 {
    private final Production16_78 production = new Production16_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}