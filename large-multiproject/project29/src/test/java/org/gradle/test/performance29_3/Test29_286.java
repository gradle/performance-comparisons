package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_286 {
    private final Production29_286 production = new Production29_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}