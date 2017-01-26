package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_82 {
    private final Production39_82 production = new Production39_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}