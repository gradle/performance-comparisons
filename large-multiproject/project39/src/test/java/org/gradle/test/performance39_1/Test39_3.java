package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_3 {
    private final Production39_3 production = new Production39_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}