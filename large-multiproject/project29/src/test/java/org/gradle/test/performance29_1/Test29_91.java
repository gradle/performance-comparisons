package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_91 {
    private final Production29_91 production = new Production29_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}