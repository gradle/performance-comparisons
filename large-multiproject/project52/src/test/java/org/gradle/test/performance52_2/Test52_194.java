package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_194 {
    private final Production52_194 production = new Production52_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}