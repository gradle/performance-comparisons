package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_167 {
    private final Production39_167 production = new Production39_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}