package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_434 {
    private final Production2_434 production = new Production2_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}