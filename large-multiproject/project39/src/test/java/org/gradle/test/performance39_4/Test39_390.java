package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_390 {
    private final Production39_390 production = new Production39_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}