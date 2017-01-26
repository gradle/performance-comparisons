package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_398 {
    private final Production34_398 production = new Production34_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}