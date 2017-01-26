package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_40 {
    private final Production39_40 production = new Production39_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}