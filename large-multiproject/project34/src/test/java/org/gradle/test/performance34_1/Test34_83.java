package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_83 {
    private final Production34_83 production = new Production34_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}