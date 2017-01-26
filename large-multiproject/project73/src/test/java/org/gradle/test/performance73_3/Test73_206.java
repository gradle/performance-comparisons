package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_206 {
    private final Production73_206 production = new Production73_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}