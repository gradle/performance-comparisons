package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_444 {
    private final Production16_444 production = new Production16_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}