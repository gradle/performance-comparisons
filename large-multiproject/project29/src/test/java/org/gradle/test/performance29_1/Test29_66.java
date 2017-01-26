package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_66 {
    private final Production29_66 production = new Production29_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}