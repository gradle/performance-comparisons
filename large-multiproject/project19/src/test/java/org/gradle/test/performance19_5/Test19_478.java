package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_478 {
    private final Production19_478 production = new Production19_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}