package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_235 {
    private final Production34_235 production = new Production34_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}