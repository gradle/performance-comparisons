package org.gradle.test.performance88_2;

import static org.junit.Assert.*;

public class Test88_172 {
    private final Production88_172 production = new Production88_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}