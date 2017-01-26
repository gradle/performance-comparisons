package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_100 {
    private final Production39_100 production = new Production39_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}