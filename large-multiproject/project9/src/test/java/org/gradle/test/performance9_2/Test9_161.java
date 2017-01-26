package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_161 {
    private final Production9_161 production = new Production9_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}