package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_311 {
    private final Production91_311 production = new Production91_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}