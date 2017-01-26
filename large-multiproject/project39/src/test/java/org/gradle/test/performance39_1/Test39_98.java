package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_98 {
    private final Production39_98 production = new Production39_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}