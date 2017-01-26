package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_142 {
    private final Production34_142 production = new Production34_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}