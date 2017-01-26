package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_173 {
    private final Production15_173 production = new Production15_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}