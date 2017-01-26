package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_54 {
    private final Production15_54 production = new Production15_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}