package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_476 {
    private final Production90_476 production = new Production90_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}