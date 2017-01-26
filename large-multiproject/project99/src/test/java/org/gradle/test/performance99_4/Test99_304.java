package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_304 {
    private final Production99_304 production = new Production99_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}