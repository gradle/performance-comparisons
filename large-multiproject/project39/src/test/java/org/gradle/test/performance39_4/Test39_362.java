package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_362 {
    private final Production39_362 production = new Production39_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}