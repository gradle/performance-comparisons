package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_141 {
    private final Production19_141 production = new Production19_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}