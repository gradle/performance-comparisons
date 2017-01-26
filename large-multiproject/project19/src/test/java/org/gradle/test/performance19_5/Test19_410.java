package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_410 {
    private final Production19_410 production = new Production19_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}