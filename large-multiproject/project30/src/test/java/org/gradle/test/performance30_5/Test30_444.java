package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_444 {
    private final Production30_444 production = new Production30_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}