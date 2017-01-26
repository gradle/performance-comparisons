package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_76 {
    private final Production16_76 production = new Production16_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}