package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_464 {
    private final Production9_464 production = new Production9_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}