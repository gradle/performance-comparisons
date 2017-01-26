package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_93 {
    private final Production4_93 production = new Production4_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}