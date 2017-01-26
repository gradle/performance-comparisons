package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_170 {
    private final Production91_170 production = new Production91_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}