package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_173 {
    private final Production10_173 production = new Production10_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}