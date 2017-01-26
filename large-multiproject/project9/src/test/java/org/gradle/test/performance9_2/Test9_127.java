package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_127 {
    private final Production9_127 production = new Production9_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}