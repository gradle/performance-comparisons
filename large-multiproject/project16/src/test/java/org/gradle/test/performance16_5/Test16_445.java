package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_445 {
    private final Production16_445 production = new Production16_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}