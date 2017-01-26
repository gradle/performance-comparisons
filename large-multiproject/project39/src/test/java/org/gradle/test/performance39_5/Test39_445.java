package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_445 {
    private final Production39_445 production = new Production39_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}