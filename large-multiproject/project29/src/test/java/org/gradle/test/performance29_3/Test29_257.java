package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_257 {
    private final Production29_257 production = new Production29_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}