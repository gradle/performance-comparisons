package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_181 {
    private final Production79_181 production = new Production79_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}