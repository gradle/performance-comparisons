package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_64 {
    private final Production15_64 production = new Production15_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}