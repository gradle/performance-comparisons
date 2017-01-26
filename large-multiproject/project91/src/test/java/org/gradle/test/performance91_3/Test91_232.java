package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_232 {
    private final Production91_232 production = new Production91_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}