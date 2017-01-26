package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_173 {
    private final Production49_173 production = new Production49_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}