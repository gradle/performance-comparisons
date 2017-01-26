package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_233 {
    private final Production19_233 production = new Production19_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}