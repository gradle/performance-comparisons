package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_104 {
    private final Production29_104 production = new Production29_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}