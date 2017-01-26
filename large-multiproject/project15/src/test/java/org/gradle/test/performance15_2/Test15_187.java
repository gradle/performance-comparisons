package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_187 {
    private final Production15_187 production = new Production15_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}