package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_434 {
    private final Production85_434 production = new Production85_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}