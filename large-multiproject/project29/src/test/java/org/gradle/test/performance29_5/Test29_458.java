package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_458 {
    private final Production29_458 production = new Production29_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}