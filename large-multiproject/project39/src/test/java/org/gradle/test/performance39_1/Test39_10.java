package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_10 {
    private final Production39_10 production = new Production39_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}