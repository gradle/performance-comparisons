package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_68 {
    private final Production16_68 production = new Production16_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}