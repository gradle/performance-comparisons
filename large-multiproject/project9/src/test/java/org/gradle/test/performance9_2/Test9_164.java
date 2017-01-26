package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_164 {
    private final Production9_164 production = new Production9_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}