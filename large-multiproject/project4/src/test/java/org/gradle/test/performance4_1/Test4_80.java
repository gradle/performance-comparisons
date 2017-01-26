package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_80 {
    private final Production4_80 production = new Production4_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}