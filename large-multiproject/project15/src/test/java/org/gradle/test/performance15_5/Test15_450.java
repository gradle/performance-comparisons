package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_450 {
    private final Production15_450 production = new Production15_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}