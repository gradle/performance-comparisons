package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_492 {
    private final Production9_492 production = new Production9_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}