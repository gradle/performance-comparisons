package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_491 {
    private final Production19_491 production = new Production19_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}