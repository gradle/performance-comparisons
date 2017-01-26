package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_143 {
    private final Production9_143 production = new Production9_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}