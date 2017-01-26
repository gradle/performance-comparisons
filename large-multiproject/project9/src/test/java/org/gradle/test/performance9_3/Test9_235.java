package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_235 {
    private final Production9_235 production = new Production9_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}