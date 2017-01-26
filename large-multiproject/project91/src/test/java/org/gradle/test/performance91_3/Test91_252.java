package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_252 {
    private final Production91_252 production = new Production91_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}