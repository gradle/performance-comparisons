package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_168 {
    private final Production39_168 production = new Production39_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}