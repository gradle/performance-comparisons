package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_325 {
    private final Production39_325 production = new Production39_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}