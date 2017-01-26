package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_465 {
    private final Production16_465 production = new Production16_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}