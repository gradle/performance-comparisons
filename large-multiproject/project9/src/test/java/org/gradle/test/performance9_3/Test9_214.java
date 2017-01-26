package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_214 {
    private final Production9_214 production = new Production9_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}