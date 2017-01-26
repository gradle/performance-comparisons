package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_477 {
    private final Production15_477 production = new Production15_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}