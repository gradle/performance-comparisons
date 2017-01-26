package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_113 {
    private final Production91_113 production = new Production91_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}