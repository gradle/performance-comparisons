package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_134 {
    private final Production16_134 production = new Production16_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}