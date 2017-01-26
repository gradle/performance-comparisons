package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_298 {
    private final Production19_298 production = new Production19_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}