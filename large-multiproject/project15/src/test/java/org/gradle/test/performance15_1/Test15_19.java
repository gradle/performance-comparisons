package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_19 {
    private final Production15_19 production = new Production15_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}