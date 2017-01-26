package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_103 {
    private final Production9_103 production = new Production9_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}