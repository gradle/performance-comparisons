package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_48 {
    private final Production15_48 production = new Production15_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}