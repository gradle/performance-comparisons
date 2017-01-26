package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_205 {
    private final Production91_205 production = new Production91_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}