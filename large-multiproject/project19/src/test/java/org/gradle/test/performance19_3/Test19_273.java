package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_273 {
    private final Production19_273 production = new Production19_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}