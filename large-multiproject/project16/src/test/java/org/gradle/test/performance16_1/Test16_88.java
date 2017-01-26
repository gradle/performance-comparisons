package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_88 {
    private final Production16_88 production = new Production16_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}