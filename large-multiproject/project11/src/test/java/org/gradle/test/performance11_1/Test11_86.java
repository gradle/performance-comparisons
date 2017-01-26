package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_86 {
    private final Production11_86 production = new Production11_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}