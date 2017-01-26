package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_139 {
    private final Production15_139 production = new Production15_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}