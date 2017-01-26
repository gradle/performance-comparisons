package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_389 {
    private final Production19_389 production = new Production19_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}