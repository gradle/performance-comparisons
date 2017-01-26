package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_91 {
    private final Production39_91 production = new Production39_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}