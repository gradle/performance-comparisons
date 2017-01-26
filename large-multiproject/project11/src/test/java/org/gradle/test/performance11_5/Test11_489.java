package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_489 {
    private final Production11_489 production = new Production11_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}