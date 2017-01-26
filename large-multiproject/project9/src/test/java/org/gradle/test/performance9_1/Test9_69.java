package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_69 {
    private final Production9_69 production = new Production9_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}