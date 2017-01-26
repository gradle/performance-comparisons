package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_171 {
    private final Production9_171 production = new Production9_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}