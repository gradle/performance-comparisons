package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_42 {
    private final Production39_42 production = new Production39_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}