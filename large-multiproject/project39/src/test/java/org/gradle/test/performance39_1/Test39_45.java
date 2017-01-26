package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_45 {
    private final Production39_45 production = new Production39_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}