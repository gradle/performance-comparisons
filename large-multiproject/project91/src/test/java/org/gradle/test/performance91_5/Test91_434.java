package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_434 {
    private final Production91_434 production = new Production91_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}