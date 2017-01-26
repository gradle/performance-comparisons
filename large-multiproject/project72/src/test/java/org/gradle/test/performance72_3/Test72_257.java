package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_257 {
    private final Production72_257 production = new Production72_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}