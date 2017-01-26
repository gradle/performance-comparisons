package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_379 {
    private final Production99_379 production = new Production99_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}