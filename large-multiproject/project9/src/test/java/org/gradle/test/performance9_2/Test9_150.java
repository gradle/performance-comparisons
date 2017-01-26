package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_150 {
    private final Production9_150 production = new Production9_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}