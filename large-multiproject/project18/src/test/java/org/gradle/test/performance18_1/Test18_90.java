package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_90 {
    private final Production18_90 production = new Production18_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}