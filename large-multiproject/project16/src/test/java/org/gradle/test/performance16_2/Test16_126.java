package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_126 {
    private final Production16_126 production = new Production16_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}