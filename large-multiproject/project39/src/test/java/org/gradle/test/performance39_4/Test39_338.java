package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_338 {
    private final Production39_338 production = new Production39_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}