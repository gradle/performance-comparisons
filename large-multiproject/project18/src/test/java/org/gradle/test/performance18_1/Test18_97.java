package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_97 {
    private final Production18_97 production = new Production18_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}