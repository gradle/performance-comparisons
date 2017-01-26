package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_468 {
    private final Production15_468 production = new Production15_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}