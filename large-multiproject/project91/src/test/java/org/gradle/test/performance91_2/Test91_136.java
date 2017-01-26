package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_136 {
    private final Production91_136 production = new Production91_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}