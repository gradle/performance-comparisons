package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_79 {
    private final Production91_79 production = new Production91_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}