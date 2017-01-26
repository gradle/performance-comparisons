package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_173 {
    private final Production1_173 production = new Production1_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}