package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_372 {
    private final Production64_372 production = new Production64_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}