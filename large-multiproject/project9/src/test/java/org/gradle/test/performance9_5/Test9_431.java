package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_431 {
    private final Production9_431 production = new Production9_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}