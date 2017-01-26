package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_257 {
    private final Production39_257 production = new Production39_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}