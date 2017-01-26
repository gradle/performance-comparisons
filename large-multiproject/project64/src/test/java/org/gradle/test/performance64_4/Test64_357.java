package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_357 {
    private final Production64_357 production = new Production64_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}