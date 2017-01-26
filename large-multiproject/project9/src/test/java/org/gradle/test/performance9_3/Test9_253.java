package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_253 {
    private final Production9_253 production = new Production9_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}