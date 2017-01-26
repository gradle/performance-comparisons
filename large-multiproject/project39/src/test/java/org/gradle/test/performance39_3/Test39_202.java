package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_202 {
    private final Production39_202 production = new Production39_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}