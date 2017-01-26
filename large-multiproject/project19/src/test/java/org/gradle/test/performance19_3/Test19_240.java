package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_240 {
    private final Production19_240 production = new Production19_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}