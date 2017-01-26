package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_108 {
    private final Production19_108 production = new Production19_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}