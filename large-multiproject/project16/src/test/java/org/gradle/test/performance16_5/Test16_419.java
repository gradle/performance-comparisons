package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_419 {
    private final Production16_419 production = new Production16_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}