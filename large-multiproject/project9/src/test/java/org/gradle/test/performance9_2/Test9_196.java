package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_196 {
    private final Production9_196 production = new Production9_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}