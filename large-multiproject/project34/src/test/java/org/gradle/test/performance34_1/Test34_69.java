package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_69 {
    private final Production34_69 production = new Production34_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}