package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_257 {
    private final Production49_257 production = new Production49_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}