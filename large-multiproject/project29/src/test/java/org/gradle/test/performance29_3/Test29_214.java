package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_214 {
    private final Production29_214 production = new Production29_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}