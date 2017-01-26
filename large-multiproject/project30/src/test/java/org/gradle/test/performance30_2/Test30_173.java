package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_173 {
    private final Production30_173 production = new Production30_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}