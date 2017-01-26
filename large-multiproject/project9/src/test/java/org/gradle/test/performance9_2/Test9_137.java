package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_137 {
    private final Production9_137 production = new Production9_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}