package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_173 {
    private final Production7_173 production = new Production7_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}