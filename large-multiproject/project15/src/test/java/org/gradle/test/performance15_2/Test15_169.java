package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_169 {
    private final Production15_169 production = new Production15_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}