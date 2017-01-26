package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_137 {
    private final Production34_137 production = new Production34_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}