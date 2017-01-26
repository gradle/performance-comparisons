package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_474 {
    private final Production18_474 production = new Production18_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}