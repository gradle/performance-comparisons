package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_77 {
    private final Production16_77 production = new Production16_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}