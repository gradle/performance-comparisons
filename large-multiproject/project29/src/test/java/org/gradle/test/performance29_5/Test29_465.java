package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_465 {
    private final Production29_465 production = new Production29_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}