package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_372 {
    private final Production91_372 production = new Production91_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}