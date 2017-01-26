package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_203 {
    private final Production91_203 production = new Production91_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}