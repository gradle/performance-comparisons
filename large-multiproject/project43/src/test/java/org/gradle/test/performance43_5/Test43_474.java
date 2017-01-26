package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_474 {
    private final Production43_474 production = new Production43_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}