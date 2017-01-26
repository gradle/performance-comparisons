package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_423 {
    private final Production29_423 production = new Production29_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}