package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_337 {
    private final Production18_337 production = new Production18_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}