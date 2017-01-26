package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_331 {
    private final Production16_331 production = new Production16_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}