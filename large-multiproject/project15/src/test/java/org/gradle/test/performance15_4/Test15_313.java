package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_313 {
    private final Production15_313 production = new Production15_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}