package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_184 {
    private final Production19_184 production = new Production19_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}