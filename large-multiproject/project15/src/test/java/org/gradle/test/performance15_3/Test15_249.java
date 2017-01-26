package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_249 {
    private final Production15_249 production = new Production15_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}