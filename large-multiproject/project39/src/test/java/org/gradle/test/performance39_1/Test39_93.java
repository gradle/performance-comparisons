package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_93 {
    private final Production39_93 production = new Production39_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}