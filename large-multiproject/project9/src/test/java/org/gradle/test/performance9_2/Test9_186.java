package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_186 {
    private final Production9_186 production = new Production9_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}