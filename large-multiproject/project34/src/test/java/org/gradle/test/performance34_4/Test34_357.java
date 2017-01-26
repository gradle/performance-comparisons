package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_357 {
    private final Production34_357 production = new Production34_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}