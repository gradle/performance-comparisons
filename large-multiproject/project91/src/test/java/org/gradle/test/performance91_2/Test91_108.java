package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_108 {
    private final Production91_108 production = new Production91_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}