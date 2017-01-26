package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_179 {
    private final Production9_179 production = new Production9_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}