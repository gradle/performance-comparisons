package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_165 {
    private final Production9_165 production = new Production9_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}