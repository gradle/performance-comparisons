package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_45 {
    private final Production16_45 production = new Production16_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}