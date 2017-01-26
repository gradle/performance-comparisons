package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_469 {
    private final Production34_469 production = new Production34_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}