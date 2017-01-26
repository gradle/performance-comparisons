package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_89 {
    private final Production18_89 production = new Production18_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}