package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_384 {
    private final Production19_384 production = new Production19_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}