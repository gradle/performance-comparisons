package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_419 {
    private final Production18_419 production = new Production18_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}