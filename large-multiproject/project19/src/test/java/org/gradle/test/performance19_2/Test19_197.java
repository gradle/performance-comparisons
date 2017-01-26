package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_197 {
    private final Production19_197 production = new Production19_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}