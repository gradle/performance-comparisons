package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_216 {
    private final Production9_216 production = new Production9_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}