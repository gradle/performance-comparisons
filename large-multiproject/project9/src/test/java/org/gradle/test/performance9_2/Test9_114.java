package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_114 {
    private final Production9_114 production = new Production9_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}