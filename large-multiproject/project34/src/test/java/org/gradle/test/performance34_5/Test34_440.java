package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_440 {
    private final Production34_440 production = new Production34_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}