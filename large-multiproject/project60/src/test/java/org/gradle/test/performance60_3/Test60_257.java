package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_257 {
    private final Production60_257 production = new Production60_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}