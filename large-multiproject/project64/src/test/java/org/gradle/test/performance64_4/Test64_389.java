package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_389 {
    private final Production64_389 production = new Production64_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}