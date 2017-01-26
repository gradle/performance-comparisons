package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_87 {
    private final Production15_87 production = new Production15_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}