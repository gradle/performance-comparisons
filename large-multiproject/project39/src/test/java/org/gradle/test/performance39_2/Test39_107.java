package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_107 {
    private final Production39_107 production = new Production39_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}