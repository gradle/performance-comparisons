package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_480 {
    private final Production19_480 production = new Production19_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}