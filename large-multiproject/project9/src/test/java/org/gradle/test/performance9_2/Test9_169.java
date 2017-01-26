package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_169 {
    private final Production9_169 production = new Production9_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}