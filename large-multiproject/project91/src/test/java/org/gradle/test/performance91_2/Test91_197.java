package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_197 {
    private final Production91_197 production = new Production91_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}