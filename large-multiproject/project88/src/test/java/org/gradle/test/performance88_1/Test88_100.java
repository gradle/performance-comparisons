package org.gradle.test.performance88_1;

import static org.junit.Assert.*;

public class Test88_100 {
    private final Production88_100 production = new Production88_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}