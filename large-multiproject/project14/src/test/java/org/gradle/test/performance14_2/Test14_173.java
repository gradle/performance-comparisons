package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_173 {
    private final Production14_173 production = new Production14_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}