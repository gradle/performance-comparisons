package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_54 {
    private final Production79_54 production = new Production79_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}