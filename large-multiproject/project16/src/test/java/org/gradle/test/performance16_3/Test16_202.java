package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_202 {
    private final Production16_202 production = new Production16_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}