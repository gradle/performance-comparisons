package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_323 {
    private final Production18_323 production = new Production18_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}