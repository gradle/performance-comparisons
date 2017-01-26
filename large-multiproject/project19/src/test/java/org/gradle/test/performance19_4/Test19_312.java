package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_312 {
    private final Production19_312 production = new Production19_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}