package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_392 {
    private final Production9_392 production = new Production9_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}