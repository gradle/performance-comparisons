package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_183 {
    private final Production29_183 production = new Production29_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}