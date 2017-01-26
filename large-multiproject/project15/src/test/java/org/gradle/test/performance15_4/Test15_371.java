package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_371 {
    private final Production15_371 production = new Production15_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}