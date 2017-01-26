package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_247 {
    private final Production9_247 production = new Production9_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}