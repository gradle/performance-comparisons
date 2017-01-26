package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_188 {
    private final Production79_188 production = new Production79_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}