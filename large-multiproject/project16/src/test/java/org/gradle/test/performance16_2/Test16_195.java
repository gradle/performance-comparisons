package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_195 {
    private final Production16_195 production = new Production16_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}