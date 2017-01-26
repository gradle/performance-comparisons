package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_329 {
    private final Production18_329 production = new Production18_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}