package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_187 {
    private final Production9_187 production = new Production9_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}