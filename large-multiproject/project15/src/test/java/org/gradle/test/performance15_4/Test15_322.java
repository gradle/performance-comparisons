package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_322 {
    private final Production15_322 production = new Production15_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}