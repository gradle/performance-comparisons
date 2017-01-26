package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_377 {
    private final Production29_377 production = new Production29_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}