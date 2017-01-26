package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_302 {
    private final Production15_302 production = new Production15_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}