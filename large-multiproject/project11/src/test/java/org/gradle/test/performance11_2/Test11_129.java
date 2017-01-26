package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_129 {
    private final Production11_129 production = new Production11_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}