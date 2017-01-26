package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_310 {
    private final Production9_310 production = new Production9_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}