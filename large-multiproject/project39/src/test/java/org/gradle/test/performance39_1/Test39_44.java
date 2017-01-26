package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_44 {
    private final Production39_44 production = new Production39_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}