package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_477 {
    private final Production34_477 production = new Production34_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}