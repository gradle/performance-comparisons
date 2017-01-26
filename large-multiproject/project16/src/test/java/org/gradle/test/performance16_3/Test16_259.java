package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_259 {
    private final Production16_259 production = new Production16_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}