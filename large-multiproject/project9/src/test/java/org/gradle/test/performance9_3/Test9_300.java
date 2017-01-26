package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_300 {
    private final Production9_300 production = new Production9_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}