package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_350 {
    private final Production29_350 production = new Production29_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}