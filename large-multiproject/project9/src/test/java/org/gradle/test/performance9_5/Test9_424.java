package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_424 {
    private final Production9_424 production = new Production9_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}