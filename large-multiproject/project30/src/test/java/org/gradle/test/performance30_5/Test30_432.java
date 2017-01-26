package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_432 {
    private final Production30_432 production = new Production30_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}