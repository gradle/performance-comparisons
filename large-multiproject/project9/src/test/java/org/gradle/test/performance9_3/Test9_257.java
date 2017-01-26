package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_257 {
    private final Production9_257 production = new Production9_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}