package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_497 {
    private final Production9_497 production = new Production9_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}