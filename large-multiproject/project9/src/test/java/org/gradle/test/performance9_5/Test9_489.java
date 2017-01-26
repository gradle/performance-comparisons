package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_489 {
    private final Production9_489 production = new Production9_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}