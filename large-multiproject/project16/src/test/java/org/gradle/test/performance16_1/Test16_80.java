package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_80 {
    private final Production16_80 production = new Production16_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}