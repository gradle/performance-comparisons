package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_253 {
    private final Production29_253 production = new Production29_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}