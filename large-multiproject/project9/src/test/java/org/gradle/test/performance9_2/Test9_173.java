package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_173 {
    private final Production9_173 production = new Production9_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}