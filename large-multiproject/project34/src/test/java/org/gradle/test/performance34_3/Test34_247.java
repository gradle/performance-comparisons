package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_247 {
    private final Production34_247 production = new Production34_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}