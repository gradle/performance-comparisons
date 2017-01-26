package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_294 {
    private final Production39_294 production = new Production39_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}