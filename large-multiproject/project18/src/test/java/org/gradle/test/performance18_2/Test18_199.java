package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_199 {
    private final Production18_199 production = new Production18_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}