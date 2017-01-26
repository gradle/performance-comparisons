package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_89 {
    private final Production39_89 production = new Production39_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}