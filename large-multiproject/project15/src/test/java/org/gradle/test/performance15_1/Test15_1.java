package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_1 {
    private final Production15_1 production = new Production15_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}