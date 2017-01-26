package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_491 {
    private final Production64_491 production = new Production64_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}