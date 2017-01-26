package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_457 {
    private final Production29_457 production = new Production29_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}