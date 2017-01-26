package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_27 {
    private final Production16_27 production = new Production16_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}