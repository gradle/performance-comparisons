package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_88 {
    private final Production4_88 production = new Production4_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}