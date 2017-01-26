package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_440 {
    private final Production15_440 production = new Production15_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}