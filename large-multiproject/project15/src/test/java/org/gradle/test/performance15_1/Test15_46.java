package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_46 {
    private final Production15_46 production = new Production15_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}