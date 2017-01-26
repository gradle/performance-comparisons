package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_288 {
    private final Production39_288 production = new Production39_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}