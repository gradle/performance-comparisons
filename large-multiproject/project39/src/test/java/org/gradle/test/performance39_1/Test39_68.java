package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_68 {
    private final Production39_68 production = new Production39_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}