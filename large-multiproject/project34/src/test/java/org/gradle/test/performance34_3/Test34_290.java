package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_290 {
    private final Production34_290 production = new Production34_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}