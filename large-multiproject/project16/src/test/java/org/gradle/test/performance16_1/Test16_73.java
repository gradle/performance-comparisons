package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_73 {
    private final Production16_73 production = new Production16_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}