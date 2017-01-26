package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_116 {
    private final Production19_116 production = new Production19_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}