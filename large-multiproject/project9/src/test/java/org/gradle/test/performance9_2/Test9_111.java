package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_111 {
    private final Production9_111 production = new Production9_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}