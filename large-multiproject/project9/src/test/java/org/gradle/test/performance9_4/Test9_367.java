package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_367 {
    private final Production9_367 production = new Production9_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}