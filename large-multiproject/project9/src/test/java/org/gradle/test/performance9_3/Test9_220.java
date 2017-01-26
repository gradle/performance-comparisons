package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_220 {
    private final Production9_220 production = new Production9_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}