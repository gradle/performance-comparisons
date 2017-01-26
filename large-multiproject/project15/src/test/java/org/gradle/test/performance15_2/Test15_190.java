package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_190 {
    private final Production15_190 production = new Production15_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}