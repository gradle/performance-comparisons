package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_323 {
    private final Production9_323 production = new Production9_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}