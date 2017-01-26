package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_147 {
    private final Production18_147 production = new Production18_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}