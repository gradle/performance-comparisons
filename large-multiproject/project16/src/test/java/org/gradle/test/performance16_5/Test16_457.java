package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_457 {
    private final Production16_457 production = new Production16_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}