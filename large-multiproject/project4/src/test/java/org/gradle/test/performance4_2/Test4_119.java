package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_119 {
    private final Production4_119 production = new Production4_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}