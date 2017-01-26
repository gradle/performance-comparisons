package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_235 {
    private final Production15_235 production = new Production15_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}