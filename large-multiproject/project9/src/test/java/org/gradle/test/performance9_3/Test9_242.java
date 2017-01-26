package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_242 {
    private final Production9_242 production = new Production9_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}