package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_311 {
    private final Production19_311 production = new Production19_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}