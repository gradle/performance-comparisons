package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_70 {
    private final Production9_70 production = new Production9_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}