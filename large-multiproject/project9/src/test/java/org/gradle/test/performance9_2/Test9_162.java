package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_162 {
    private final Production9_162 production = new Production9_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}