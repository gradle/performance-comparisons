package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_364 {
    private final Production9_364 production = new Production9_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}