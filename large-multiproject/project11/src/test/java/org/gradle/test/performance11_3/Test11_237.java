package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_237 {
    private final Production11_237 production = new Production11_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}