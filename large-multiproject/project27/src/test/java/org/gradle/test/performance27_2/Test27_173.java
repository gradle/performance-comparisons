package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_173 {
    private final Production27_173 production = new Production27_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}