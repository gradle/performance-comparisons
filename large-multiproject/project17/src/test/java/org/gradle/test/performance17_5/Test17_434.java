package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_434 {
    private final Production17_434 production = new Production17_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}