package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_284 {
    private final Production91_284 production = new Production91_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}