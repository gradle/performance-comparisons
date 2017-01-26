package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_27 {
    private final Production39_27 production = new Production39_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}