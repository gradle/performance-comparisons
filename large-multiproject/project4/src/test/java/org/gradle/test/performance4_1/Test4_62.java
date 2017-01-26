package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_62 {
    private final Production4_62 production = new Production4_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}