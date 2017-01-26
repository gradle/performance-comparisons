package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_421 {
    private final Production9_421 production = new Production9_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}