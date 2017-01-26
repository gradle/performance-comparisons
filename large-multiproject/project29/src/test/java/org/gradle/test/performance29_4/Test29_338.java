package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_338 {
    private final Production29_338 production = new Production29_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}