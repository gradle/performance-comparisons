package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_202 {
    private final Production29_202 production = new Production29_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}