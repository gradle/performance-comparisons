package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_8 {
    private final Production39_8 production = new Production39_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}