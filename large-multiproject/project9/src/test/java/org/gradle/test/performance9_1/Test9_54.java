package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_54 {
    private final Production9_54 production = new Production9_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}