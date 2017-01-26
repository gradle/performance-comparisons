package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_217 {
    private final Production19_217 production = new Production19_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}