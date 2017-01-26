package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_202 {
    private final Production9_202 production = new Production9_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}