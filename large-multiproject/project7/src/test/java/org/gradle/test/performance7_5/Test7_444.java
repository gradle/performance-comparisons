package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_444 {
    private final Production7_444 production = new Production7_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}