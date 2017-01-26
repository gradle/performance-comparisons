package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_485 {
    private final Production91_485 production = new Production91_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}