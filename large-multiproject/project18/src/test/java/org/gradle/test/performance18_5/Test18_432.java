package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_432 {
    private final Production18_432 production = new Production18_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}