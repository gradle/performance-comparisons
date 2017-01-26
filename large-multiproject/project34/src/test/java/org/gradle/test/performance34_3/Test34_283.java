package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_283 {
    private final Production34_283 production = new Production34_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}