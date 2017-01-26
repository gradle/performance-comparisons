package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_206 {
    private final Production19_206 production = new Production19_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}