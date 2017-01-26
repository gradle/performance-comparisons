package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_434 {
    private final Production36_434 production = new Production36_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}