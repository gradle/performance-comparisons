package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_121 {
    private final Production19_121 production = new Production19_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}