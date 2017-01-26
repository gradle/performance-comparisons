package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_168 {
    private final Production16_168 production = new Production16_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}