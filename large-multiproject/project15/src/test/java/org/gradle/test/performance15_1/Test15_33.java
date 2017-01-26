package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_33 {
    private final Production15_33 production = new Production15_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}