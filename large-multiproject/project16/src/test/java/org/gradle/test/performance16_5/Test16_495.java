package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_495 {
    private final Production16_495 production = new Production16_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}