package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_164 {
    private final Production15_164 production = new Production15_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}