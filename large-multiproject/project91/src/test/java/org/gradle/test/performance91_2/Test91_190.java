package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_190 {
    private final Production91_190 production = new Production91_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}