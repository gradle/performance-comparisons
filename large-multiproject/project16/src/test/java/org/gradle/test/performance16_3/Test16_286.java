package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_286 {
    private final Production16_286 production = new Production16_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}