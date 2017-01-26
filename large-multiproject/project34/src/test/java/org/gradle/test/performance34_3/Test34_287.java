package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_287 {
    private final Production34_287 production = new Production34_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}