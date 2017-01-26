package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_450 {
    private final Production9_450 production = new Production9_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}