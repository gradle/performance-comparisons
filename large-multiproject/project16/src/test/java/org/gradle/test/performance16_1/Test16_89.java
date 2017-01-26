package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_89 {
    private final Production16_89 production = new Production16_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}