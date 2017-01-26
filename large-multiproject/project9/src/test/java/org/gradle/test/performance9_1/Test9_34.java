package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_34 {
    private final Production9_34 production = new Production9_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}