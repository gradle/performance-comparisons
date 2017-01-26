package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_209 {
    private final Production18_209 production = new Production18_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}