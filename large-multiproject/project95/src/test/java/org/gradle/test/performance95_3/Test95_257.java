package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_257 {
    private final Production95_257 production = new Production95_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}