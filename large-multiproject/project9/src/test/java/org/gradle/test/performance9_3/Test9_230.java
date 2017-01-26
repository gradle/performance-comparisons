package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_230 {
    private final Production9_230 production = new Production9_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}