package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_238 {
    private final Production29_238 production = new Production29_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}