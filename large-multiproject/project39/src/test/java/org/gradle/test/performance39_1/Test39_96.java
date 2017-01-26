package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_96 {
    private final Production39_96 production = new Production39_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}