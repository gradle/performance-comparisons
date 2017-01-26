package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_467 {
    private final Production11_467 production = new Production11_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}