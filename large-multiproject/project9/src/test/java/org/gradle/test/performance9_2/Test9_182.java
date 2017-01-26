package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_182 {
    private final Production9_182 production = new Production9_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}