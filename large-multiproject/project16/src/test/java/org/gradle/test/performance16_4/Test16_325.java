package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_325 {
    private final Production16_325 production = new Production16_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}