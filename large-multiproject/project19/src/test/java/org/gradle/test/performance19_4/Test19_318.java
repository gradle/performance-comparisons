package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_318 {
    private final Production19_318 production = new Production19_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}