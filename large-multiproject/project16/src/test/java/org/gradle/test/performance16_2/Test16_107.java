package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_107 {
    private final Production16_107 production = new Production16_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}