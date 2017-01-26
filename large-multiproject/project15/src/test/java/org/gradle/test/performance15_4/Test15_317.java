package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_317 {
    private final Production15_317 production = new Production15_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}