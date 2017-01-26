package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_287 {
    private final Production91_287 production = new Production91_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}