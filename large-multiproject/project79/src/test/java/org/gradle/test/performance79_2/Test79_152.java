package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_152 {
    private final Production79_152 production = new Production79_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}