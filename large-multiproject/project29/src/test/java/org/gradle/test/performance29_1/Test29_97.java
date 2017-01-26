package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_97 {
    private final Production29_97 production = new Production29_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}