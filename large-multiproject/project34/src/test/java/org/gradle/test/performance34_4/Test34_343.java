package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_343 {
    private final Production34_343 production = new Production34_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}