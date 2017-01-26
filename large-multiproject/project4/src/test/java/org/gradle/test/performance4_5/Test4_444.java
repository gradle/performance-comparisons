package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_444 {
    private final Production4_444 production = new Production4_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}