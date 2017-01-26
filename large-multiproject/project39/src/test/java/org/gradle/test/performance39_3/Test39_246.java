package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_246 {
    private final Production39_246 production = new Production39_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}