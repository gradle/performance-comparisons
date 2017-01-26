package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_66 {
    private final Production16_66 production = new Production16_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}