package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_162 {
    private final Production79_162 production = new Production79_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}