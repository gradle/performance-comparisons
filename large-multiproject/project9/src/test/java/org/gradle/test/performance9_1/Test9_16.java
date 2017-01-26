package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_16 {
    private final Production9_16 production = new Production9_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}