package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_31 {
    private final Production15_31 production = new Production15_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}