package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_249 {
    private final Production79_249 production = new Production79_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}