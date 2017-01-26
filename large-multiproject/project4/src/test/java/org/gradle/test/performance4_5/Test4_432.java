package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_432 {
    private final Production4_432 production = new Production4_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}