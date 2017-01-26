package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_119 {
    private final Production16_119 production = new Production16_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}