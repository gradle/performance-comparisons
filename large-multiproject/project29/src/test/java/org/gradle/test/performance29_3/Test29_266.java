package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_266 {
    private final Production29_266 production = new Production29_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}