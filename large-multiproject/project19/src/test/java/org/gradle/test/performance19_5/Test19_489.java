package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_489 {
    private final Production19_489 production = new Production19_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}