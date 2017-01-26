package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_485 {
    private final Production19_485 production = new Production19_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}