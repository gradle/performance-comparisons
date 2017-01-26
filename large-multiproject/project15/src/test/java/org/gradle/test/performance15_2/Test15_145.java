package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_145 {
    private final Production15_145 production = new Production15_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}