package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_166 {
    private final Production16_166 production = new Production16_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}