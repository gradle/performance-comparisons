package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_183 {
    private final Production16_183 production = new Production16_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}