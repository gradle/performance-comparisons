package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_305 {
    private final Production18_305 production = new Production18_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}