package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_409 {
    private final Production91_409 production = new Production91_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}