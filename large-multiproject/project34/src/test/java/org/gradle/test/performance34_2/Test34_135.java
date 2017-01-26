package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_135 {
    private final Production34_135 production = new Production34_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}