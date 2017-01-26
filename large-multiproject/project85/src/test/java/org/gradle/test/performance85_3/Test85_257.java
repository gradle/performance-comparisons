package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_257 {
    private final Production85_257 production = new Production85_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}