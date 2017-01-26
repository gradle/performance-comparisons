package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_486 {
    private final Production9_486 production = new Production9_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}