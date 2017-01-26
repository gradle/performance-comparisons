package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_56 {
    private final Production91_56 production = new Production91_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}