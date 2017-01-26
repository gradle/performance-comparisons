package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_75 {
    private final Production39_75 production = new Production39_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}