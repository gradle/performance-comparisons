package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_257 {
    private final Production15_257 production = new Production15_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}