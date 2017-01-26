package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_309 {
    private final Production9_309 production = new Production9_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}