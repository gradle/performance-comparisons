package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_349 {
    private final Production19_349 production = new Production19_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}