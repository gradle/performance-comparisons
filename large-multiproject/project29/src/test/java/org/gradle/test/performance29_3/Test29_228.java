package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_228 {
    private final Production29_228 production = new Production29_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}