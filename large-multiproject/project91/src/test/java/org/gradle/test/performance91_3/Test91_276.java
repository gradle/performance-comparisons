package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_276 {
    private final Production91_276 production = new Production91_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}