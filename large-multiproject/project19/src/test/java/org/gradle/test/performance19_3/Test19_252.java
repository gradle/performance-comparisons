package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_252 {
    private final Production19_252 production = new Production19_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}