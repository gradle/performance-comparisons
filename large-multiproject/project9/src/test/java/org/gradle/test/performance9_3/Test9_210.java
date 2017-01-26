package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_210 {
    private final Production9_210 production = new Production9_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}