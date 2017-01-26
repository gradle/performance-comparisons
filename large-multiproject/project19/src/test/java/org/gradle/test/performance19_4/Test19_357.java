package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_357 {
    private final Production19_357 production = new Production19_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}