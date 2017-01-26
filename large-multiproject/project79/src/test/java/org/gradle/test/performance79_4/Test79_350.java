package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_350 {
    private final Production79_350 production = new Production79_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}