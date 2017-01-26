package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_71 {
    private final Production18_71 production = new Production18_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}