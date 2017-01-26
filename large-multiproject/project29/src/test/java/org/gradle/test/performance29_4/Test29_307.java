package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_307 {
    private final Production29_307 production = new Production29_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}