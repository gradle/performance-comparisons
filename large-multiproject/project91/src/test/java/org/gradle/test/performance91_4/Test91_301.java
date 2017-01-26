package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_301 {
    private final Production91_301 production = new Production91_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}