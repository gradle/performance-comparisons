package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_441 {
    private final Production34_441 production = new Production34_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}