package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_421 {
    private final Production34_421 production = new Production34_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}