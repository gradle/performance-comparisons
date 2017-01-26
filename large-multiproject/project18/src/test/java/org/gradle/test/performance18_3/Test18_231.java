package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_231 {
    private final Production18_231 production = new Production18_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}