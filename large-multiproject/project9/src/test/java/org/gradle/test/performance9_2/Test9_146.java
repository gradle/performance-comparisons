package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_146 {
    private final Production9_146 production = new Production9_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}