package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_81 {
    private final Production9_81 production = new Production9_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}