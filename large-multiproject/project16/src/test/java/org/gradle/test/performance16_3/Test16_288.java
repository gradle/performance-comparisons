package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_288 {
    private final Production16_288 production = new Production16_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}