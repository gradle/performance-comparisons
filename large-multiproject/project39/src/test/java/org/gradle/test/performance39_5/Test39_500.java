package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_500 {
    private final Production39_500 production = new Production39_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}