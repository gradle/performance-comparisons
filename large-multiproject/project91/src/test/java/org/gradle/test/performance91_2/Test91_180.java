package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_180 {
    private final Production91_180 production = new Production91_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}