package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_401 {
    private final Production19_401 production = new Production19_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}