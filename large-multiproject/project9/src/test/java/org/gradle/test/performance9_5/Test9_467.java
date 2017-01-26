package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_467 {
    private final Production9_467 production = new Production9_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}