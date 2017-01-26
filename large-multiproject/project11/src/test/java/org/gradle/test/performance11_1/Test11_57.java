package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_57 {
    private final Production11_57 production = new Production11_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}