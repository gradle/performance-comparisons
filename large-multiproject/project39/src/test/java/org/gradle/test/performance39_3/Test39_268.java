package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_268 {
    private final Production39_268 production = new Production39_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}