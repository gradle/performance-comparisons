package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_330 {
    private final Production39_330 production = new Production39_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}