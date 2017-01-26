package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_482 {
    private final Production15_482 production = new Production15_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}