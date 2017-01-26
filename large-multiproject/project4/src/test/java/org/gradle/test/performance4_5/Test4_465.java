package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_465 {
    private final Production4_465 production = new Production4_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}