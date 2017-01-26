package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_462 {
    private final Production9_462 production = new Production9_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}