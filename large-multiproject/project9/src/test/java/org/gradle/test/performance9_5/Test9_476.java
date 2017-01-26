package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_476 {
    private final Production9_476 production = new Production9_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}