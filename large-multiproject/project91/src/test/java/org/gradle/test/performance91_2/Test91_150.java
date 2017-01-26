package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_150 {
    private final Production91_150 production = new Production91_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}