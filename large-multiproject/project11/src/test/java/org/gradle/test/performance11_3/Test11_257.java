package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_257 {
    private final Production11_257 production = new Production11_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}