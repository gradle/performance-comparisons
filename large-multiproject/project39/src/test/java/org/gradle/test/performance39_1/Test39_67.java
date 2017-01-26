package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_67 {
    private final Production39_67 production = new Production39_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}