package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_328 {
    private final Production19_328 production = new Production19_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}