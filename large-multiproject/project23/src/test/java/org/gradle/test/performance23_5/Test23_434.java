package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_434 {
    private final Production23_434 production = new Production23_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}