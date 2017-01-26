package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_495 {
    private final Production39_495 production = new Production39_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}