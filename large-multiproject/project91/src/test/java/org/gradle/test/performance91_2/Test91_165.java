package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_165 {
    private final Production91_165 production = new Production91_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}