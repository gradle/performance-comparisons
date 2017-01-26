package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_476 {
    private final Production99_476 production = new Production99_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}