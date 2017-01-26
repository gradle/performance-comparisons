package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_265 {
    private final Production15_265 production = new Production15_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}