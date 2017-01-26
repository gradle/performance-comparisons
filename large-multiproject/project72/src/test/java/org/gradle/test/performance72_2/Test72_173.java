package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_173 {
    private final Production72_173 production = new Production72_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}