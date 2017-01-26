package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_466 {
    private final Production29_466 production = new Production29_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}