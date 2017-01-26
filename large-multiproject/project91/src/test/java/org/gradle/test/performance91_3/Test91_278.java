package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_278 {
    private final Production91_278 production = new Production91_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}