package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_96 {
    private final Production4_96 production = new Production4_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}