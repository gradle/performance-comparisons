package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_293 {
    private final Production29_293 production = new Production29_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}