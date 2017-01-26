package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_401 {
    private final Production9_401 production = new Production9_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}