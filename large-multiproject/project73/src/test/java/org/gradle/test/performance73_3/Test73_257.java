package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_257 {
    private final Production73_257 production = new Production73_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}