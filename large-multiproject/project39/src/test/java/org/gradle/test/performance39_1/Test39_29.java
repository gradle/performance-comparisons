package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_29 {
    private final Production39_29 production = new Production39_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}