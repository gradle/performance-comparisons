package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_444 {
    private final Production18_444 production = new Production18_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}