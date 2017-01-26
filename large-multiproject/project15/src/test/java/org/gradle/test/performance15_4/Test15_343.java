package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_343 {
    private final Production15_343 production = new Production15_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}