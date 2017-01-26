package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_309 {
    private final Production29_309 production = new Production29_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}