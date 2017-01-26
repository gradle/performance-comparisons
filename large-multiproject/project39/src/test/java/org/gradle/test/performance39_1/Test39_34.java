package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_34 {
    private final Production39_34 production = new Production39_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}