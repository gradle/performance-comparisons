package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_188 {
    private final Production29_188 production = new Production29_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}