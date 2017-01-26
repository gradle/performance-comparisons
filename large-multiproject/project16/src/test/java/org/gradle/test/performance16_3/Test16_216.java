package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_216 {
    private final Production16_216 production = new Production16_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}