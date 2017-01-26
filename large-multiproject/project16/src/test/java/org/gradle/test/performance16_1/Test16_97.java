package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_97 {
    private final Production16_97 production = new Production16_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}