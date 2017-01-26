package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_63 {
    private final Production15_63 production = new Production15_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}