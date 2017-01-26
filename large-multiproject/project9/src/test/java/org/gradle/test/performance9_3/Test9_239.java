package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_239 {
    private final Production9_239 production = new Production9_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}