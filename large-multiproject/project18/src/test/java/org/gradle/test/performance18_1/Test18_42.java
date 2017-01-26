package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_42 {
    private final Production18_42 production = new Production18_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}