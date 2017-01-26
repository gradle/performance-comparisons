package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_466 {
    private final Production18_466 production = new Production18_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}