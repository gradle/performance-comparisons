package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_235 {
    private final Production91_235 production = new Production91_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}