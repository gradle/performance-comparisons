package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_350 {
    private final Production16_350 production = new Production16_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}