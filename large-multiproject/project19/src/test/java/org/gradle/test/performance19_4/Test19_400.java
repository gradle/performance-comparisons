package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_400 {
    private final Production19_400 production = new Production19_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}