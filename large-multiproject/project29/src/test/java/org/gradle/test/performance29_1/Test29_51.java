package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_51 {
    private final Production29_51 production = new Production29_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}