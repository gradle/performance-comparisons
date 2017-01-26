package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_39 {
    private final Production39_39 production = new Production39_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}