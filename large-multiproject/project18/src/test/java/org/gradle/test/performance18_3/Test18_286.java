package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_286 {
    private final Production18_286 production = new Production18_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}