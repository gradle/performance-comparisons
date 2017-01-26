package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_86 {
    private final Production19_86 production = new Production19_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}