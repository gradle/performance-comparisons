package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_166 {
    private final Production18_166 production = new Production18_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}