package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_18 {
    private final Production15_18 production = new Production15_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}