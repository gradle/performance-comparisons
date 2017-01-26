package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_37 {
    private final Production15_37 production = new Production15_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}