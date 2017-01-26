package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_75 {
    private final Production16_75 production = new Production16_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}