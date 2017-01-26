package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_421 {
    private final Production15_421 production = new Production15_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}