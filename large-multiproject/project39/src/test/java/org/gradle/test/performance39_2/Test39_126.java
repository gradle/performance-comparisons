package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_126 {
    private final Production39_126 production = new Production39_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}