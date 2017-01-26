package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_212 {
    private final Production39_212 production = new Production39_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}