package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_257 {
    private final Production42_257 production = new Production42_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}