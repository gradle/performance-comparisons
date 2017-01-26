package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_109 {
    private final Production18_109 production = new Production18_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}