package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_332 {
    private final Production91_332 production = new Production91_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}