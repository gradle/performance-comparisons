package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_409 {
    private final Production19_409 production = new Production19_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}