package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_97 {
    private final Production39_97 production = new Production39_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}