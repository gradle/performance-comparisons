package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_198 {
    private final Production91_198 production = new Production91_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}