package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_379 {
    private final Production15_379 production = new Production15_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}