package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_374 {
    private final Production64_374 production = new Production64_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}