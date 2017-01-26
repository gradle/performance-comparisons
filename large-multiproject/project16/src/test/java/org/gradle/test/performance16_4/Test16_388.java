package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_388 {
    private final Production16_388 production = new Production16_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}