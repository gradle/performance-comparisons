package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_107 {
    private final Production18_107 production = new Production18_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}