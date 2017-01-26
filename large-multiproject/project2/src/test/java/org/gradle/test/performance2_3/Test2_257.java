package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_257 {
    private final Production2_257 production = new Production2_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}