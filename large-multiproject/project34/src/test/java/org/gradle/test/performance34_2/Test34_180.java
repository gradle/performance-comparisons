package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_180 {
    private final Production34_180 production = new Production34_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}