package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_127 {
    private final Production79_127 production = new Production79_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}