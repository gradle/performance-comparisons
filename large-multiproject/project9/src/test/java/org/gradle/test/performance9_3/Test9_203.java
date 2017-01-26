package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_203 {
    private final Production9_203 production = new Production9_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}