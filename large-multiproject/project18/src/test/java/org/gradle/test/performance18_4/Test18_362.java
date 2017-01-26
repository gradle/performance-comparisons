package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_362 {
    private final Production18_362 production = new Production18_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}