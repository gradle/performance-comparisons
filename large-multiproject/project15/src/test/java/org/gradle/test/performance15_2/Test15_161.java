package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_161 {
    private final Production15_161 production = new Production15_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}