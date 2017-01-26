package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_63 {
    private final Production9_63 production = new Production9_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}