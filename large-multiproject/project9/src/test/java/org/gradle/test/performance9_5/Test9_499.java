package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_499 {
    private final Production9_499 production = new Production9_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}