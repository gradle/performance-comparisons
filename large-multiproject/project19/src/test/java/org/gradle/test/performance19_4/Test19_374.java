package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_374 {
    private final Production19_374 production = new Production19_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}