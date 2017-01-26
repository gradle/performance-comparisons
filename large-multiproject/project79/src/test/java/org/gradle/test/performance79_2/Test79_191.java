package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_191 {
    private final Production79_191 production = new Production79_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}