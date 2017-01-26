package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_286 {
    private final Production39_286 production = new Production39_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}