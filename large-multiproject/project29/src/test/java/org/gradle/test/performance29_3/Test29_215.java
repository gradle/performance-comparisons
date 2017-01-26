package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_215 {
    private final Production29_215 production = new Production29_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}