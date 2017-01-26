package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_76 {
    private final Production39_76 production = new Production39_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}