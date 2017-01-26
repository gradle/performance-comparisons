package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_62 {
    private final Production39_62 production = new Production39_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}