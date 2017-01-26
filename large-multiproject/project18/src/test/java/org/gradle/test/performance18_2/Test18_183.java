package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_183 {
    private final Production18_183 production = new Production18_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}