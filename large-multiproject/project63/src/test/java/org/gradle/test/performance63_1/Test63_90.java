package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_90 {
    private final Production63_90 production = new Production63_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}