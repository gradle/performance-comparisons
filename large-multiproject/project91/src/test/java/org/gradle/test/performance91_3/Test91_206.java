package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_206 {
    private final Production91_206 production = new Production91_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}