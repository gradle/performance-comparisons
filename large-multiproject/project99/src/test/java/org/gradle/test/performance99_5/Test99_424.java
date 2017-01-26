package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_424 {
    private final Production99_424 production = new Production99_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}