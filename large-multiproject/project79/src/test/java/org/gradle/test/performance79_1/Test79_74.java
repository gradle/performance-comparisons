package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_74 {
    private final Production79_74 production = new Production79_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}