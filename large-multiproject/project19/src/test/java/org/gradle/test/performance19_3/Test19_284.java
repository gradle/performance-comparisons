package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_284 {
    private final Production19_284 production = new Production19_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}