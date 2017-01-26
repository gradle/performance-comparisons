package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_173 {
    private final Production99_173 production = new Production99_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}