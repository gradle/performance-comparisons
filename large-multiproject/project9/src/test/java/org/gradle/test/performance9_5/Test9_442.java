package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_442 {
    private final Production9_442 production = new Production9_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}