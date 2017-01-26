package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_151 {
    private final Production9_151 production = new Production9_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}