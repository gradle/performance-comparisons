package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_436 {
    private final Production91_436 production = new Production91_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}