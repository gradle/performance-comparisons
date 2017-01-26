package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_203 {
    private final Production29_203 production = new Production29_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}