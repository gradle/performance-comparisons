package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_41 {
    private final Production39_41 production = new Production39_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}