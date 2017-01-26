package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_373 {
    private final Production9_373 production = new Production9_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}