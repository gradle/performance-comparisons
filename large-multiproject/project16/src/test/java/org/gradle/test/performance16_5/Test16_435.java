package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_435 {
    private final Production16_435 production = new Production16_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}