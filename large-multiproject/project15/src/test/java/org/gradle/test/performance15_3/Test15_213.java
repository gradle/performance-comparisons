package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_213 {
    private final Production15_213 production = new Production15_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}