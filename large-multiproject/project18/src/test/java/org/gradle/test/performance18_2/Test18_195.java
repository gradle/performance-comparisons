package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_195 {
    private final Production18_195 production = new Production18_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}