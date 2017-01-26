package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_218 {
    private final Production9_218 production = new Production9_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}