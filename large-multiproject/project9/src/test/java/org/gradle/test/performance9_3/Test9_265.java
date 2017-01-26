package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_265 {
    private final Production9_265 production = new Production9_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}