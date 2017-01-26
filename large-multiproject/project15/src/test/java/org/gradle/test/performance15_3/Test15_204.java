package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_204 {
    private final Production15_204 production = new Production15_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}