package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_89 {
    private final Production79_89 production = new Production79_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}