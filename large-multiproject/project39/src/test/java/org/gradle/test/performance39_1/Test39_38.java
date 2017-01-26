package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_38 {
    private final Production39_38 production = new Production39_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}