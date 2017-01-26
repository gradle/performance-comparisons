package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_134 {
    private final Production29_134 production = new Production29_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}