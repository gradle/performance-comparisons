package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_127 {
    private final Production91_127 production = new Production91_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}