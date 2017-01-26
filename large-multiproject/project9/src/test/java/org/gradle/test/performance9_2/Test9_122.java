package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_122 {
    private final Production9_122 production = new Production9_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}