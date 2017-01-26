package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_83 {
    private final Production15_83 production = new Production15_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}