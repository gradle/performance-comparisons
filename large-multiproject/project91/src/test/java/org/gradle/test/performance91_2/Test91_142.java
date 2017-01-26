package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_142 {
    private final Production91_142 production = new Production91_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}