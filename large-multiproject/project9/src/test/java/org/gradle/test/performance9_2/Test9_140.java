package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_140 {
    private final Production9_140 production = new Production9_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}