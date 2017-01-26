package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_446 {
    private final Production9_446 production = new Production9_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}