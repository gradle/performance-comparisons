package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_485 {
    private final Production64_485 production = new Production64_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}