package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_188 {
    private final Production9_188 production = new Production9_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}