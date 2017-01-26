package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_147 {
    private final Production9_147 production = new Production9_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}