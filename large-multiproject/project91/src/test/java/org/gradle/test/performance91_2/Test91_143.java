package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_143 {
    private final Production91_143 production = new Production91_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}