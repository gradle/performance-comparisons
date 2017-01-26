package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_382 {
    private final Production16_382 production = new Production16_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}