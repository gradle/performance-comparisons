package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_304 {
    private final Production15_304 production = new Production15_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}