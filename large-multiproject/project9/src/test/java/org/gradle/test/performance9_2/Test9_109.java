package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_109 {
    private final Production9_109 production = new Production9_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}