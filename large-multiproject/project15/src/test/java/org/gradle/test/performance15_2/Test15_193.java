package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_193 {
    private final Production15_193 production = new Production15_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}